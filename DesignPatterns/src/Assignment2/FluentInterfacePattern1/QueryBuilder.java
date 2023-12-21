package Assignment2.FluentInterfacePattern1;



public class QueryBuilder {
    private String selectClause = "";
    private String fromClause = "";
    private String whereClause = "";
    private String orderByClause = "";


    public QueryBuilder select(String columns) {
        selectClause = "SELECT " + columns;
        return this;
    }

    public QueryBuilder from(String table) {
        this.fromClause = "FROM " + table;
        return this;
    }

    public QueryBuilder where(String condition) {
        this.whereClause = "WHERE " + condition;
        return this;
    }

    public QueryBuilder orderBy(String column) {
        this.orderByClause = "ORDER BY " + column;
        return this;
    }

    public Query build() {
        return new  Query(selectClause + " " + fromClause + " " + whereClause + " " + orderByClause);
    }
}