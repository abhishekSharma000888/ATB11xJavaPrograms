package task;

public class Task22_ATBMember {
    protected String memberId;

    public Task22_ATBMember(String memberId) {
        this.memberId = memberId;
    }

    public void showMember() {
        System.out.println("Member ID: " + memberId);
    }
}

class ATBStudentMember extends Task22_ATBMember {
    protected String university;

    public ATBStudentMember(String memberId, String university) {
        super(memberId);
        this.university = university;
    }

    @Override
    public void showMember() {
        super.showMember();
        System.out.println("University: " + university);
    }
}

class ATBGoldStudent extends ATBStudentMember {  // Multilevel inheritance
    private double discount;

    public ATBGoldStudent(String memberId, String university, double discount) {
        super(memberId, university);
        this.discount = discount;
    }

    @Override
    public void showMember() {
        super.showMember();
        System.out.println("Discount: " + discount + "%");
    }
}
