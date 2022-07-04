package com.bxlFormation.coursAlex.ExoStream;

import java.util.*;
import java.util.stream.Collectors;

public class VilleService {
    private Collection<Ville> villes;

    public VilleService() {
        setup();
    }

    public void setup(){
        List<Habitant> hegiature = List.of(
                new Habitant("Moore", "Thierry", "rue Barbe", 86),
                new Habitant("Kimtsaris", "Alexandre", "rue Barbe", 207),
                new Habitant("Cabuchon", "Melanie", "rue Vazy", 49),
                new Habitant("Colat", "Thierry", "rue Barbe", 86),
                new Habitant("Zaine", "Aude", "boulevard Icelle", 158)
        );

        List<Habitant> brequin = List.of(
                new Habitant("Delpeche", "Maude", "rue Stique", 128),
                new Habitant("Otor", "Amine", "avenue Truc", 64),
                new Habitant("Delince", "Jean", "avenue Truc", 7),
                new Habitant("Tovarovitch", "Mélodie", "rue Bonhomme", 2),
                new Habitant("Richard", "Nathan", "avenue Truc", 64),
                new Habitant("Rapier", "William", "rue Machin", 128)
        );

        List<Habitant> quithyme = List.of(
                new Habitant("Harrison", "Paul", "rue du Passage", 207),
                new Habitant("Cament", "Medhi", "rue du Passage", 200),
                new Habitant("Richard", "Nathan", "avenue Truc", 64)
        );

        this.villes = List.of(
                new Ville(1000, "Hégiature", hegiature, 1500),
                new Ville(2510, "Brequin", brequin, 800),
                new Ville(9510, "Quityme", quithyme, 3000)
        );
    }

    public Ville getWithHighestTaxe(){
        //region ma fonction
//                if(this.villes.size()>0){
//                    double highestTax = this.villes
//                            .stream()
//                            .mapToDouble(Ville::getMontantTaxe)
//                            .max().getAsDouble();
//
//                    Ville villeWithHighestTax = this.villes
//                            .stream()
//                            .filter(v -> v.getMontantTaxe() == highestTax).collect(Collectors.toList())
//                            .get(0);
//                    return villeWithHighestTax;
//                }
//                return null;
        //endregion
        //region Correction
        return this.villes
                .stream()
//                .sorted((v1,v2)->(int)(v2.getMontantTaxe()- v1.getMontantTaxe()))
//                .findFirst()
                .max(Comparator.comparingDouble(Ville::getMontantTaxe))
                .orElseThrow();
        //endregion
    }

    public List<String> getCityNames(){
        // TODO retourner la liste des noms des villes
        return this.villes.stream().map(Ville::getNom).collect(Collectors.toList());
    }

    public Habitant getMostTaxed(){
        // TODO Retourner l'habitant qui le plus été taxé ou lancer une RuntimeException
        //region ma fonction
//        try {
//            double mostTaxed =  this.villes.stream()
//                    .map(v->{
//                        return v.getHabitants().stream()
//                                .mapToDouble(Habitant::getTotalTaxes)
//                                .max()
//                                .orElseThrow();
//                    })
//                    .mapToDouble(a-> a)
//                    .max()
//                    .orElseThrow();
//
//            List<Habitant> listHabitantMostTaxed = this.villes.stream()
//                    .map(v-> {
//                        return v.getHabitants().stream()
//                                .filter(h -> {
//                                    return h.getTotalTaxes() == mostTaxed;
//                                })
//                                .collect(Collectors.toList());
//                    })
//                    .filter(h->{
//                        Habitant tmp = h.size() > 0 ? h.get(0) : null;
//                        return tmp != null && tmp.getTotalTaxes() == mostTaxed;
//                    })
//                    .collect(Collectors.toList())
//                    .get(0);
//
//            return listHabitantMostTaxed.size()>0 ? listHabitantMostTaxed.get(0):null;
//        }catch (RuntimeException e){
//            System.out.println(e);
//        }
//
//        return null;
        //endregion
        //region Correction
        return this.villes
                .stream()
                .flatMap(v->v.getHabitants().stream())
                .max(Comparator.comparingDouble(Habitant::getTotalTaxes))
                .orElseThrow(()->new RuntimeException("pas d'habitant"));
        //endregion

    }

    public List<String> getStreets(){
        // TODO retourner le nom des rue des villes gérées ou habitent des gens (pas de doublon)
        // attention, plusieurs habitant sont dans la même rue

        //region ma fonction
//        ArrayList<String> streets = new ArrayList<>(){};
//
//        this.villes.stream()
//                .map(Ville::getHabitants)
//                .forEach(H->{
//                     H.stream()
//                        .map(Habitant::getRue)
//                        .distinct()
//                        .forEach(streets::add);
//                });
//        return streets.stream().toList();
        //endregion
        //region Correction
        return this.villes
                .stream()
                .flatMap(v->v.getHabitants().stream().map(Habitant::getRue).distinct())
                .collect(Collectors.toList());
        //endregion
    }

    public void taxe(char begin){
        // TODO faire en sorte que tous les habitants des villes gérées dont le nom commence
        // par la lettre en param payent leur taxe.
        this.villes
            .stream()
            .filter(v->v.getNom().toLowerCase().charAt(0) == Character.toLowerCase(begin))
//            .forEach(v->v.getHabitants().forEach(h->h.payerTaxe(v.getMontantTaxe())));
            .forEach(Ville::taxer);

            //region Par nom d'habitant commençant par la lettre
//        this.villes
//            .forEach(v->{
//                v.getHabitants().stream()
//                        .filter(h->h.getNom().toLowerCase().charAt(0) ==  Character.toLowerCase(begin) )
//                        .forEach(h->h.payerTaxe(v.getMontantTaxe()));
//            });
            //endregion
    }
}
