package com.versionone.apiclient;

/**
 * This class is used to wrap the results of a query and
 * to allow the caller to know how many total items are
 * available
 *
 * @author Jerry D. Odenwelder Jr.
 */
public class QueryResult {
    private Asset[] assets;
    private int total;
    private Query query;

    /**
     * Get the Assets returned by the Query
     *
     * @return array of Asset
     */
    public Asset[] getAssets() {
        return assets;
    }

    /**
     * Get the total number of Assets available
     *
     * @return int
     */
    public int getTotalAvaliable() {
        return total;
    }

    /**
     * Get the query used to generate this
     *
     * @return Query
     */
    public Query getQuery() {
        return query;
    }

    /**
     * @param assets
     * @param total
     * @param query
     */
    QueryResult(Asset[] assets, int total, Query query) {
        this.assets = assets;
        this.total = total;
        this.query = query;
    }

    /**
     * Use this constructor when you want to create a result with nothing
     *
     * @param query - Query
     */
    public QueryResult(Query query) {
        this(new Asset[0], 0, query);
    }
}
