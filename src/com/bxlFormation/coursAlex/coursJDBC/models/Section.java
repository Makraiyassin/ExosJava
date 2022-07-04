package com.bxlFormation.coursAlex.coursJDBC.models;

import java.util.HashMap;

public class Section {
    private final int section_id;
    private final String sectionName;
    private final Integer delegate_id;

    public Section(int section_id, String sectionName, Integer delegate_id) {
        this.section_id = section_id;
        this.sectionName = sectionName;
        this.delegate_id = delegate_id;
    }

    public int getSection_id() {
        return section_id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public Integer getDelegate_id() {
        return delegate_id;
    }

    @Override
    public String toString() {
        return "\nSection{" +
                "section_id=" + section_id +
                ", sectionName='" + sectionName + '\'' +
                ", delegate_id=" + delegate_id +
                '}';
    }
}
