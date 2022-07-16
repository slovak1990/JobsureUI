package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;

public class TeamPage {

    public static final String TEAM_PAGE_URL = "https://jobsure.ru/team";

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

    // кнопка Инстаграм верхняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-instagram']")
    private SelenideElement instagramUpperButton;

    // кнопка Инстаграм нижняя
    @FindBy(how = How.XPATH, using = "//*[@class='fa fa-instagram fa-lg']")
    private SelenideElement instagramLowerButton;

    // кнопка Live Internet
    @FindBy(how = How.XPATH, using = "//*[@id='licnt3187']")
    private SelenideElement lifeInternetButton;

    // кнопка Политика конфиденциальности
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

    // кнопка подтверждения Рассылки по почте
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

    // поле ввода Email в нижней части меню
    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    private SelenideElement footerEmailField;

    // поле ввода текста во всплывающем окне
    @FindBy(how = How.XPATH, using = "//*[@class='inputField_a573']")
    private SelenideElement sendMessageWindowField;

    // раздел Напишите нам
    @FindBy(how = How.XPATH, using = "//*[@class='text-center']")
    private SelenideElement writeToUsSection;

    // поле Ваше имя
    @FindBy(how = How.XPATH, using = "//*[@id='name']")
    private SelenideElement nameField;

    // поле email
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Email']")
    private SelenideElement emailField;

    // поле Ваш номер телефона
    @FindBy(how = How.XPATH, using = "//*[@id='phone']")
    private SelenideElement phoneField;

    // поле Расскажите о своём опыте
    @FindBy(how = How.XPATH, using = "//*[@id='message']")
    private SelenideElement messageField;

    // кнопка Отправить
    @FindBy(how = How.XPATH, using = "//*[@id='send_message']")
    private SelenideElement sendMessageButton;

    // картинка в разделе Команда (слушатели)
    @FindBy(how = How.XPATH, using = "//*[@data-bgimage='url(images/background/bg-subheader-1.jpg) top']")
    private SelenideElement teamImage;

    // статья Алексей
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Алексей')]")
    private SelenideElement alexArticle;

    // интервью с Алексеем
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Мне пришла идея создать')]")
    private SelenideElement alexInterview;

    // фото Алексея
    @FindBy(how = How.XPATH, using = "//*[@data-bgimage='url(images/team/Alexey.jpeg) center']")
    private SelenideElement alexImage;

    // статья Дарья
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Дарья')]")
    private SelenideElement darijaArticle;

    // интервью с Дарьей
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Я работаю именно с человеком')]")
    private SelenideElement darijaInterview;

    // фото Дарьи
    @FindBy(how = How.XPATH, using = "url(images/team/Daria.jpg) center")
    private SelenideElement darijaImage;

    // статья Никита
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Никита')]")
    private SelenideElement nikitaArticle;

    // интервью с Никитой
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Я прошел долгий путь')]")
    private SelenideElement nikitaInterview;

    // фото Никиты
    @FindBy(how = How.XPATH, using = "url(images/team/Никита1.jpg) center")
    private SelenideElement nikitaImage;

    // статья Александр
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Александр')]")
    private SelenideElement alexandrArticle;

    // интервью с Александр
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Я окончил курсы')]")
    private SelenideElement alexandrInterview;

    // фото Александр
    @FindBy(how = How.XPATH, using = "url(images/team/Александр.jpg) center")
    private SelenideElement alexandrImage;

    // статья Сергей бэкенд
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[6]/div[1]/div/div/h2")
    private SelenideElement sergeyBackArticle;

    // интервью с Сергеем бэкенд
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Сейчас работаю разработчиком')]")
    private SelenideElement sergeyBackInterview;

    // фото Сергея бэкенд
    @FindBy(how = How.XPATH, using = "url(images/team/суп.jpg) center")
    private SelenideElement sergeyBackImage;

    // статья Сергей фронт
    @FindBy(how = How.XPATH, using = "//*[@id='content']/section[7]/div[1]/div/div/h2")
    private SelenideElement sergeyFrontArticle;

    // интервью с Сергеем фронт
    @FindBy(how = How.XPATH, using = "//*[contains (text(), 'Могу точно сказать')]")
    private SelenideElement sergeyFrontInterview;

    // фото Сергея фронт
    @FindBy(how = How.XPATH, using = "url(images/team/сергейт.jpg) center")
    private SelenideElement sergeyFrontImage;


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
    public ResumePage clickPricesUpperButton() {
        pricesUpperButton.click();
        return page(ResumePage.class);
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
        return this;
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

    @Step("Scroll and set value in footer email field")
    public TeamPage setFooterEmailField(String email) {
        footerEmailField.scrollTo();
        footerEmailField.setValue(email);
        return this;
    }

    @Step("Click confirm send mailing button")
    public TeamPage clickConfirmSendMailingButton() {
        confirmSendMailingButton.click();
        return this;
    }

    @Step("Scroll to footer and click scroll up button")
    public TeamPage clickScrollUpButton() {
        footerEmailField.scrollTo();
        scrollUpButton.click();
        return this;
    }

    @Step("Set value in send message window field")
    public TeamPage setSendMessageWindowField(String message) {
        sendMessageWindowField.setValue(message);
        return this;
    }

    @Step("Scroll to write to us Section")
    public TeamPage scrollToWriteToUsSection(){
        writeToUsSection.scrollTo();
        return this;
    }

    @Step("Set value in name field")
    public TeamPage setNameField(String name) {
        nameField.setValue(name);
        return this;
    }

    @Step("Set value in email field")
    public TeamPage setEmailField(String email) {
        emailField.setValue(email);
        return this;
    }

    @Step("Set value in phone field")
    public TeamPage setPhoneField(String phone) {
        phoneField.setValue(phone);
        return this;
    }

    @Step("Set value in message field")
    public TeamPage setMessageField(String message) {
        messageField.setValue(message);
        return this;
    }

    @Step("Click send message button")
    public TeamPage clickSendMessageButton() {
        sendMessageButton.click();
        return this;
    }

    @Step("Team image is displayed")
    public boolean isDisplayedTeamImage() {
        return teamImage.isDisplayed();
    }

    @Step("Scroll to Alexey article")
    public TeamPage scrollToAlexArticle() {
        alexArticle.scrollTo();
        return this;
    }

    @Step("Alexey interview is displayed")
    public boolean isDisplayedAlexInterview() {
        return alexInterview.isDisplayed();
    }

    @Step("Alexey image is displayed")
    public boolean isDisplayedAlexImage() {
        return alexImage.isDisplayed();
    }

    @Step("Scroll to Darija article")
    public TeamPage scrollToDarijaArticle() {
        darijaArticle.scrollTo();
        return this;
    }

    @Step("Darija interview is displayed")
    public boolean isDisplayedDarijaInterview() {
        return darijaInterview.isDisplayed();
    }

    @Step("Darija image is displayed")
    public boolean isDisplayedDarijaImage() {
        return darijaImage.isDisplayed();
    }

    @Step("Scroll to Nikita article")
    public TeamPage scrollToNikitaArticle() {
        nikitaArticle.scrollTo();
        return this;
    }

    @Step("Nikita interview is displayed")
    public boolean isDisplayedNikitaInterview() {
        return nikitaInterview.isDisplayed();
    }

    @Step("Nikita image is displayed")
    public boolean isDisplayedNikitaImage() {
        return nikitaImage.isDisplayed();
    }

    @Step("Scroll to Alexandr article")
    public TeamPage scrollToAlexandrArticle() {
        alexandrArticle.scrollTo();
        return this;
    }

    @Step("Alexandr interview is displayed")
    public boolean isDisplayedAlexandrInterview() {
        return alexandrInterview.isDisplayed();
    }

    @Step("Alexandr image is displayed")
    public boolean isDisplayedAlexandrImage() {
        return alexandrImage.isDisplayed();
    }

    @Step("Scroll to Sergey Backend article")
    public TeamPage scrollToSergeyBackArticle() {
        sergeyBackArticle.scrollTo();
        return this;
    }

    @Step("Sergey backend interview is displayed")
    public boolean isDisplayedSergeyBackInterview() {
        return sergeyBackInterview.isDisplayed();
    }

    @Step("Sergey backend image is displayed")
    public boolean isDisplayedSergeyBackImage() {
        return sergeyBackImage.isDisplayed();
    }

    @Step("Scroll to Sergey frontend article")
    public TeamPage scrollToSergeyFrontArticle() {
        sergeyFrontArticle.scrollTo();
        return this;
    }

    @Step("Sergey frontend interview is displayed")
    public boolean isDisplayedSergeyFrontInterview() {
        return sergeyFrontInterview.isDisplayed();
    }

    @Step("Sergey frontend image is displayed")
    public boolean isDisplayedSergeyFrontImage() {
        return sergeyFrontImage.isDisplayed();
    }
}
