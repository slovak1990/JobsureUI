package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;

public class PrivacyPolicy {

    public static final String PRIVACY_POLICY_PAGE_URL = "https://jobsure.ru/privacy-policy";

                                                // локаторы
    //  логотип сайта верхний
    @FindBy(how = How.XPATH, using = "//*[@class='logo']")
    private SelenideElement logoUpperImage;

    // логотип сайта нижний
    @FindBy(how = How.XPATH, using = "//*[@class='img-fluid mb20 footer__logo']")
    private SelenideElement logoLowerImage;

    // кнопка Фейсбук верхняя
    @FindBy(how = How.XPATH, using = "//*[@id='topbar']/div/div[1]/span/a[1]/i")
    private SelenideElement facebookUpperButton;

    // кнопка Фейсбук нижняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-facebook fa-lg']")
    private SelenideElement facebookLowerButton;

    // кнопка Инстаграмм верхняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-instagram']")
    private SelenideElement instagramUpperButton;

    // кнопка Инстаграмм нижняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-instagram fa-lg']")
    private SelenideElement instagramLowerButton;

    // кнопка Live Internet
    @FindBy(how = How.XPATH, using = "//*[@id='licnt3187']")
    private SelenideElement lifeInternetButton;

    // кнопка Политика конфидециальности
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Политика конфиденциальности')]")
    private SelenideElement privacyPolicyButton;

    // кнопка Цены верхняя
    @FindBy(how = How.XPATH, using = "//span/a[@href='/prices']")
    private SelenideElement pricesUpperButton;

    // кнопка Часто задаваемые вопросы
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Часто задаваемые вопросы')]")
    private SelenideElement faqButton;

    // кнопка Главная
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Главная')]")
    private SelenideElement mainButton;

    // кнопка Резюме
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Резюме')]")
    private SelenideElement resumeButton;

    // кнопка Команда
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Команда')]")
    private SelenideElement teamButton;

    // кнопка Цены нижняя
    @FindBy(how = How.XPATH, using = "//li/a[@href='/prices']")
    private SelenideElement pricesLowerButton;

    // кнопка Контакты
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Контакты')]")
    private SelenideElement contactsButton;

    // кнопка скролла вверх
    @FindBy(how = How.XPATH, using = "//*[@id='back-to-top']")
    private SelenideElement scrollUpButton;

    // кнопка подверждения Рассылки по почте
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-long-arrow-right']")
    private SelenideElement confirmSendMailingButton;

    // всплывающее окно Напишите нам сообщение
    @FindBy(how = How.XPATH, using = "//*[@class='hoverl_c3b3']")
    private SelenideElement sendMessageWindow;

    // кнопка закрытия всплывающего окна
    @FindBy(how = How.XPATH, using = "//*[@class='closeIcon_fba0']")
    private SelenideElement closeSendMessageWindow;

    // кнопка отправки текста сообщения во всплывающем окне
    @FindBy(how = How.XPATH, using = "//*[@class='sendButton_fe98']")
    private SelenideElement sendMessageInWindowButton;

    // картинка на странице Политика конфедициальности (девушка)
    @FindBy(how = How.XPATH, using = "//*[@data-bgimage='url(images/background/bg-subheader-3.jpg) top']")
    private SelenideElement privacyPolicyImage;

    // текст Общие положения
    @FindBy(how = How.XPATH, using = "//*[contains (text(), '1. Общие положения ')]")
    private SelenideElement generalProvisionsText;

    // поле ввода Email в нижней части меню
    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    private SelenideElement footerEmailField;

    // поле ввода текста в всплывающее окно
    @FindBy(how = How.XPATH, using = "//*[@class='inputField_a573']")
    private SelenideElement sendMessageWindowField;

    // раздел олитика в отношении обработки персональных данных
    @FindBy(how = How.XPATH, using = "//*[@class='mt30 wow fadeInUp animated animated']")
    private SelenideElement privacyPolicySection;

                                                // методы
    @Step("Click header logo image")
    public MainPage clickLogoUpperImage() {
        logoUpperImage.click();
        return page(MainPage.class);
    }

    @Step("Scroll and click footer logo image")
    public MainPage clickLogoLowerImage() {
        logoLowerImage.scrollTo();
        logoLowerImage.click();
        return page(MainPage.class);
    }

    @Step("Click main button")
    public MainPage clickMainButton() {
        mainButton.click();
        return page(MainPage.class);
    }

    @Step("Click header facebook logo and switch to new window")
    public void clickFacebookUpperButton() {
        facebookUpperButton.click();
        switchTo().window(1);
    }

    @Step("Scroll, click footer facebook logo and switch to new window")
    public void clickFacebookLowerButton() {
        facebookLowerButton.scrollTo();
        facebookLowerButton.click();
        switchTo().window(1);
    }

    @Step("Click header instagram logo and switch to new window")
    public void clickInstagramUpperButton() {
        instagramUpperButton.click();
        switchTo().window(1);
    }

    @Step("Scroll, click footer instagram logo and switch to new window")
    public void clickInstagramLowerButton() {
        instagramLowerButton.scrollTo();
        instagramLowerButton.click();
        switchTo().window(1);
    }

    @Step("Click life internet button and switch to new window")
    public void clickLifeInternetButton() {
        lifeInternetButton.click();
        switchTo().window(1);
    }

    @Step("Click privacy policy button")
    public PrivacyPolicy clickPrivacyPolicyButton() {
        privacyPolicyButton.click();
        return page(PrivacyPolicy.class);
    }

    @Step("Click upper prices button")
    public PricesPage clickPricesUpperButton() {
        pricesUpperButton.click();
        return page(PricesPage.class);
    }

    @Step("Click faq button")
    public FaqPage clickFaqButton() {
        faqButton.click();
        return page(FaqPage.class);
    }

    @Step("Click resume button")
    public ResumePage clickResumeButton() {
        resumeButton.click();
        return page(ResumePage.class);
    }

    @Step("Click team button")
    public TeamPage clickTeamButton() {
        teamButton.click();
        return page(TeamPage.class);
    }

    @Step("Click lower prices button")
    public PricesPage clickPricesLowerButton() {
        pricesLowerButton.click();
        return page(PricesPage.class);
    }

    @Step("Click contacts button")
    public ContactsPage clickContactsButton() {
        contactsButton.click();
        return page(ContactsPage.class);
    }

    @Step("Header image (women) is displayed")
    public boolean isDisplayedPrivacyPolicyImage() {
        return privacyPolicyImage.isDisplayed();
    }

    @Step("General provisions text is displayed")
    public boolean isDisplayedGeneralProvisionsText() {
        return generalProvisionsText.isDisplayed();
    }

    @Step("Section privacy policy section is displayed")
    public boolean isDisplayedPrivacyPolicySection() {
        return privacyPolicySection.isDisplayed();
    }

    @Step("Scroll and set value in footer email field")
    public PrivacyPolicy setFooterEmailField(String email) {
        footerEmailField.scrollTo();
        footerEmailField.setValue(email);
        return this;
    }

    @Step("Click confirm send mailing button")
    public PrivacyPolicy clickConfirmSendMailingButton() {
        confirmSendMailingButton.click();
        return this;
    }

    @Step("Scroll to footer and click scroll up button")
    public PrivacyPolicy clickScrollUpButton() {
        footerEmailField.scrollTo();
        scrollUpButton.click();
        return this;
    }

    @Step("Set value in send message window field")
    public PrivacyPolicy setSendMessageWindowField(String message) {
        sendMessageWindowField.setValue(message);
        return this;
    }

    @Step("Click send message window")
    public PrivacyPolicy clickSendMessageWindow() {
        sendMessageWindow.click();
        return this;
    }

    @Step("Click close send message window")
    public PrivacyPolicy clickCloseSendMessageWindow() {
        closeSendMessageWindow.click();
        return this;
    }
}
