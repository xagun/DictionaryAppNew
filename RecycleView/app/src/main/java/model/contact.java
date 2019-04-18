package model;

public class contact {

    private String name;
    private String phoneNp;
    private int imageId;

    public contact(String name, String phoneNp, int imageId) {
        this.name = name;
        this.phoneNp = phoneNp;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNp() {
        return phoneNp;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNp(String phoneNp) {
        this.phoneNp = phoneNp;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}

