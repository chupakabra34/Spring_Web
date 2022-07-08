import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Request {

    public static MultiMap getQueryParams(String url) {
        MultiMap parameter = new MultiValueMap();
        List<NameValuePair> params;
        try {
            params = URLEncodedUtils.parse(new URI(url), StandardCharsets.UTF_8);
            for (NameValuePair param : params) {
                if (param.getName() != null && param.getValue() != null) {
                    parameter.put(param.getName(), param.getValue());
                }
            }
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        return parameter;
    }

    public static String getQueryParamsPath(String url) {
        String rezult;
        int x = url.indexOf("?");
        if (x == -1) {
            return url;
        }
        rezult = url.substring(0, x);
        return rezult;
    }
}