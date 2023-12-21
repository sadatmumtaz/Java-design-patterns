package Assignment2.FluentInterfacePattern1;



public class Query {
    private String query;

    public Query(String query) {
        this.query = query;
    }

    public void execute() {
        System.out.println("Query executed: " + query);
    }
}
