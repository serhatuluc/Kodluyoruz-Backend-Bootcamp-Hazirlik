package JAVA101.methods;

public class bos {
    public static void main(String[] args) {
        Sports sport = new Sports();
        String name = sport.getName();
        System.out.println(name);
        sport.getNumberOfTeamMembers();

        Soccer sport2 = new Soccer();
        String name2 = sport2.getName();
        System.out.println(name2);
        sport2.getNumberOfTeamMembers();
    }
}
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

