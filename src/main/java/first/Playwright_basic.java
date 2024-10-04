package first;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwright_basic {

	public static void main(String[] args) {
		Playwright play=Playwright.create();
		Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://qa-rims-k8s.blubirch.com");
		String title= page.title();
		System.out.println("page title"+" " + title);
		String url= page.url();
		System.out.println("URL"+" " + url);
	}

}
