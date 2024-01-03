public class Main {

    public static void main(String[] args){
        PersonBuilder builder = new PersonBuilder();
        builder.setFirstName("Luigi");
        builder.setLastName("Rossi");
        builder.setAge(18);
        builder.setAddress("Via Cruillas 21");
        Person persona1 = builder.build();

        Person persona2 = new PersonBuilder().build();
        persona2.setFirstName("Davide");
        persona2.setLastName("Verdi");
        persona2.setAge(22);
        persona2.setAddress("Viale Dei Giardini 19");


        System.out.println("persona1: "  + persona1 );
        System.out.println("persona2: "  + persona2 );
    }

}
