package Assignment2.FluentInterfacePattern1;



public class Main {
    public static void main(String[] args) {
        Query query = new QueryBuilder()
                .select("id, username, email")
                .from("users")
                .where("active = true")
                .orderBy("username")
                .build();

        query.execute();
    }
}
