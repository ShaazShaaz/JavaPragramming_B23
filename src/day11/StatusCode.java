package day11;

public class StatusCode {
    public static void main(String[] args) {
        /*
         HTTP is the protocol that governs communications between web-servers and web clients.
         Part of the protocol includes a status code returned by the server to tell the browser the
         status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable


         */
        int statusCode=200;
        String name="";


        switch (statusCode){
            case 200:
                name="Ok";
                break;
            case 201:
                name="Created";
                break;
            case 202:
                name="Accepted";
                break;
            case 301:
                name="Moved Permanently";
                break;
            case 303:
                name="See Other";
                break;
            case 304:
                name="Not Modified";
                break;
            case 307:
                name="Temporary Redirect";
                break;
            case 400:
                name="Bad Request";
                break;
            case 401:
                name="Unauthorized";
                break;
            case 403:
                name="Forbidden";
                break;
            case 404:
                name="Not Found";
                break;
            case 410:
                name="Gone";
                break;
            case 500:
                name="Internal Server Error";
                break;
            case 503:
                name="Service Unavailable";
                break;
            default:
                name="Invalid code";
                break;


        }
        System.out.println(name);


    }
}
