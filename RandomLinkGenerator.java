import java.util.Random;

public class RandomURLGenerator {

    private static final String[] domains = {
        "example.com",
        "mysite.org",
        "testsite.net",
        "randomurl.com",
        "website.io"
    };

    private static final String[] paths = {
        "/home",
        "/about",
        "/contact",
        "/products",
        "/services",
        "/blog"
    };

    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate and display 10 random URLs
        for (int i = 0; i < 1; i++) {
            String randomURL = generateRandomURL(random);
            System.out.println(randomURL);
        }
    }

    private static String generateRandomURL(Random random) {
        // Select random domain and path
        String domain = domains[random.nextInt(domains.length)];
        String path = paths[random.nextInt(paths.length)];
        
        // Construct the full URL
        return "https://" + domain + path;
    }
}
