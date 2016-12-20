package org.akaiserg.test.response;

/**
 * Created by andreskaiser on 19-12-16.
 */
public class Response {

    private final long id;
    private final String result;

    public Response(long id, String result){

        this.id=id;
        this.result=result;

    }

    public long getId() {
        return id;
    }

    public String getResult() {
        return result;
    }
}
