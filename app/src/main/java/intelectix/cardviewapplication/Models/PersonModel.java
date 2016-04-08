package intelectix.cardviewapplication.Models;

/**
 * Representa a una persona
 */
public class PersonModel {

    int personId;
    String personName;
    String personLastName;
    String personJob;
    int personImageId;

    /**
     * Constructor vacio
     */
    public PersonModel(){}

    /**
     *
     * @param personId
     * @param personName
     * @param personLastName
     * @param personJob
     * @param personImageId
     */
    public PersonModel(int personId, String personName, String personLastName, String personJob, int personImageId){
        this.personId = personId;
        this.personName = personName;
        this.personLastName = personLastName;
        this.personJob = personJob;
        this.personImageId = personImageId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonJob() {
        return personJob;
    }

    public void setPersonJob(String personJob) {
        this.personJob = personJob;
    }

    public int getPersonImageId() {
        return personImageId;
    }

    public void setPersonImageId(int personImageId) {
        this.personImageId = personImageId;
    }
}
