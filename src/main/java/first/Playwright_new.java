package first;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_new {

	public static void main(String[] args) {
		Playwright play = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser = play.chromium().launch(lp);
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1536,467));
		Page page = browser.newPage();
		page.navigate("https://qa-rims-k8s.blubirch.com");
		String title = page.title();
		System.out.println("page title" + " " + title);
		String url = page.url();
		System.out.println("URL" + " " + url);

		page.close();
		browser.close();
	}

}
