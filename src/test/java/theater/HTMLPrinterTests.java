package theater;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class HTMLPrinterTests {

    private static String loadString(String path) {
        try {
            return new String(Objects.requireNonNull(HTMLPrinterTests.class
                            .getClassLoader()
                            .getResourceAsStream(path))
                    .readAllBytes());
        }
        catch (IOException exception) {
                fail("resource file could not be loaded prior to test executing");
            }
        return "";
    }

    // uncomment the test below if you write the HTMLStatementPrinter class in the optional task
//    @Test
//    public void exampleHTMLStatementTest() {
//
//        String expected = loadString("HTMLStatementExample.html");
//
//        JSONObject a = new JSONObject(loadString("plays.json"));
//
//        Map<String, Play> plays = new HashMap<>();
//
//        for (String s : a.keySet()) {
//            JSONObject play = (JSONObject) a.get(s);
//            plays.put(s, new Play(play.getString("name"), play.getString("type")));
//        }
//
//        JSONArray ja = new JSONArray(loadString("invoices.json"));
//
//        for (Object jo : ja) {
//            JSONObject jinvoice = (JSONObject) jo;
//            String customer = jinvoice.getString("customer");
//            JSONArray jperformances = jinvoice.getJSONArray("performances");
//            List<Performance> performances = new ArrayList<>();
//            for (Object s : jperformances) {
//                JSONObject performance = (JSONObject) s;
//                performances.add(new Performance(performance.getString("playID"),
//                        performance.getInt("audience")));
//            }
//
//            Invoice invoice = new Invoice(customer, performances);
//
//            StatementPrinter statementPrinter = new HTMLStatementPrinter(invoice, plays);
//            String result = statementPrinter.statement();
//            // ensure consistent line endings are being used
//            result = result.replace("\r\n", "\n");
//            expected = expected.replace("\r\n", "\n");
//
//            assertEquals(String.format("Actual output:%n%s%nExpected:%s", result, expected), expected, result);
//        }
//
//    }
}
