package com.sman.company;

public class Staff extends Person{
    private String post;
    private Boolean isAcamedicStaff;
    private String schoolName;



    public Staff(String name, int age, String post, Boolean isAcamedicStaff, String schoolName) {
        super(name, age);
        this.post = post;
        this.isAcamedicStaff = isAcamedicStaff;
        this.schoolName = schoolName;
    }



//    @Override
//    public void punish() {
//        super.punish();
//        System.out.println("I like to punish erring students ");
//    }

    public void teach(){
        System.out.println("Any staff can teach students how to behave well");
    }

    public void advise(){
        System.out.println("Good staff advice students to be good");
    }

    public String getPost() {
        return post;
    }

    public Boolean getAcamedicStaff() {
        return isAcamedicStaff;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
