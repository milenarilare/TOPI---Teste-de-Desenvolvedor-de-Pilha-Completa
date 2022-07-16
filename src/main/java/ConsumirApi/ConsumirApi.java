/**package ConsumirApi;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class ConsumirApi {


    private static String URLBase = "https://www.themealdb.com/api/json/v1/1/search.php?s=";


    private static ConsumirApi instance;

    private CloseableHttpClient clienteHTTP;

    public ConsumirApi() {
        this.clienteHTTP = HttpClients.createDefault();

    }

    public static ConsumirApi getInstance() {
        if (instance == null) {
            instance = new ConsumirApi();
        }
        return instance;
    }

    public String doRequest(String path) {

        String responseBody = null;
        try {
            HttpGet httpGet = new HttpGet(ConsumirApi.URLBase +  path);


            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 600) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;

                    } else {
                          throw new ClientProtocolException("Unexpected response status:" + status);
                    }


                }


            };
            responseBody = this.clienteHTTP.execute(httpGet, responseHandler);
            System.out.println("------------------------------");

        } catch (IOException ex) {
            Logger.getLogger(ConsumirApi.class.getName()).log(Level.SEVERE, null, ex);

        }
        return responseBody;

    }



    } */




