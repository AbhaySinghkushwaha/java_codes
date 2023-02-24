public class Keywork_01 {
    //if then is ambiguity between intance variable and formed prameters, this 
    //keyword resolves the problem of ambihuity
    
    int rollno;
    String name;
    float fee;
    Keywork_01(int rollno,String name , float fee){
        this.rollno=rollno;
        this.fee =fee;

    }         
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
    public static void main(String[] args){
        Keywork_01 s1 = new Keywork_01(111,"Ankit",5000f);
        Keywork_01 s2 = new Keywork_01(112,"Sumit",6000f);
        s1.display();
        s2.display();
    }
    
}
