package com.bxlFormation.coursAlex.coursJDBC;

import java.util.HashMap;

public class Section {
    private int section_id;
    private String sectionName;
    private int delegate_id;

    public Section(int section_id, String sectionName, int delegate_id) {
        this.section_id = section_id;
        this.sectionName = sectionName;
        this.delegate_id = delegate_id;
    }

    @Override
    public String toString() {
        return "Section{" +
                "section_id=" + section_id +
                ", sectionName='" + sectionName + '\'' +
                ", delegate_id=" + delegate_id +
                '}';
    }
}
