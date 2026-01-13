package Work;

public class UserInfo {

    //사용자 정보 저장 할수 있는 클래스 (  이름, 아이디, 비밀번호, 전화번호 )


    public String name;
    public String ID;
    public String passWord;
    public int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public UserInfo(String name, String ID, String passWord, int phoneNumber) {
        this.name = name;
        this.ID = ID;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
    }
}
