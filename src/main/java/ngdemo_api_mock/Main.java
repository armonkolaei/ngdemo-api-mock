package ngdemo_api_mock;

import com.github.tomakehurst.wiremock.WireMockServer;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class Main {
    public static void main(String[] args) {
        WireMockServer wireMockServer = new WireMockServer(options().port(8080).usingFilesUnderDirectory("."));
        wireMockServer.start();
        System.out.println("WireMock server started on http://localhost:8080");
    }
}
