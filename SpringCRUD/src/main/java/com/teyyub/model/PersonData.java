package com.teyyub.model;

//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author teyyub , 1:40:03 AM
 */
 
public class PersonData {

    private Integer personId;
    private String personName;

    private List<PersonData> personDataList;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<PersonData> getPersonDataList() {
        return personDataList;
    }

    public void setPersonDataList(List<PersonData> personDataList) {
        this.personDataList = personDataList;
    }

}
