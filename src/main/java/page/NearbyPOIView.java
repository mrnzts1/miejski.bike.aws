package page;

import config.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.List;

import static config.TestBase.getDriver;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static org.testng.Assert.assertTrue;

public class NearbyPOIView extends Page {

    public NearbyPOIView() throws MalformedURLException {
        super();
    }
    @AndroidFindBy(id = "poiListData")
    protected MobileElement NEARBY_POI_LIST;

    @AndroidFindBy(id = "poiItemDistance")
    protected MobileElement POI_DISTANCE;

    @AndroidFindBy(id = "poiItemIcon")
    protected MobileElement POI_ICON;

    @AndroidFindBy(id = "menu_filter")
    protected MobileElement FILTER;

    @AndroidFindBy(id = "around_location")
    protected MobileElement AROUND_LOCATION;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Around screen center']"))
    protected MobileElement NEARBY_POI_AROUND_SCREEN;

    @AndroidFindBy(id = "checkbox")
    protected List<MobileElement> ALL_CHECKBOXES;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Around GPS position']"))
    protected MobileElement NEARBY_POI_AROUND_GPS_RADIO_BUTTON;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Around GPS position']"))
    protected MobileElement NEARBY_POI_AROUND_GPS;

    @AndroidFindBy(id = "poiListEmptyMessage")
    protected MobileElement POI_LIST_EMPTY_MESSAGE;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='IBOMBO']"))
    protected MobileElement IBOMBO;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Bicycle parking']"))
    protected MobileElement BICYCLE_PARKING;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Veturilo']"))
    protected MobileElement VETURILO;

    @AndroidFindBy(id = "handle")
    protected MobileElement POI_HANDLE;

    @AndroidFindBy(id = "main_toolbar")
    protected MobileElement MAIN_TOOLBAR;

    @AndroidFindBy(id = "title")
    protected MobileElement POI_TITLE;

    @AndroidFindBy(id = "report")
    protected MobileElement REPORT_ISSUE;

    @AndroidFindBy(id = "pointMoreInfo")
    protected MobileElement POI_ADDRESS;

    @AndroidFindBy(id = "imageView")
    protected MobileElement POI_IMAGE;

    @AndroidFindBy(id = "counter")
    protected MobileElement POI_COUNTER;

    @AndroidFindBy(id = "pointTags")
    protected MobileElement POI_TAGS_ON_IBOMBO;

    @AndroidFindBy(id = "typeMoreInfo")
    protected MobileElement POI_MORE_INFO;

    @AndroidFindBy(id = "actionEmail")
    protected MobileElement POI_EMAIL;

    @AndroidFindBy(id = "actionFacebook")
    protected MobileElement POI_FACEBOOK;

    @AndroidFindBy(id = "actionWebsite")
    protected MobileElement POI_WEBSITE;


    public NearbyPOIView checkingIfAllCheckboxesAreSelected() {
        for (int i =0; i < 3; i++){
            Assert.assertEquals("true",ALL_CHECKBOXES.get(i).getAttribute("checked"));
        }
        return this;
    }
    public NearbyPOIView checkingIfNearbyPoiListIsDisplayed() throws MalformedURLException{
        assertTrue(NEARBY_POI_LIST.isDisplayed());
        Actions.takeScreenshot("Opening Nearby POI list...");
        return this;
    }
    public NearbyPOIView checkingIfPoiIconIsDisplayed(){
        assertTrue(POI_ICON.isDisplayed());
        return this;
    }
    public NearbyPOIView checkingIfPoiDistanceIsDisplayed(){
        assertTrue(POI_DISTANCE.isDisplayed());
        return this;
    }
    public NearbyPOIView checkingIfAroundLocationIsDisplayed(){
        assertTrue(AROUND_LOCATION.isDisplayed());
        return this;
    }
    public NearbyPOIView checkingIfFilterIconIsDisplayed() {
        assertTrue(FILTER.isDisplayed());
        return this;
    }
    public NearbyPOIView clickingFilterIcon()throws MalformedURLException{
        FILTER.click();
        Actions.takeScreenshot("Filter clicked...");
        return this;
    }
    public NearbyPOIView checkingIfNearbyPOISAroundScreenIsDisplayed() {
        assertTrue(NEARBY_POI_AROUND_SCREEN.isDisplayed());
        return this;
    }
    public NearbyPOIView clickingNearbyPOIAroundScreen()throws MalformedURLException {
        NEARBY_POI_AROUND_SCREEN.click();
        Actions.takeScreenshot("Nearby POI around screen clicked...");
        return this;
    }
    public NearbyPOIView selectingNearbyPOIAroundGPSRadioButton()throws MalformedURLException{
        NEARBY_POI_AROUND_GPS_RADIO_BUTTON.click();
        Actions.takeScreenshot("Radio buttons...");
        return this;
    }
    public NearbyPOIView checkingIfNearbyPOIIsChangedToAroundGPS() {
        assertTrue(NEARBY_POI_AROUND_GPS.isDisplayed());
        return this;
    }
    public NearbyPOIView unselectingAllCheckboxes() throws MalformedURLException {
        for (int i =0; i < 3; i++){
            ALL_CHECKBOXES.get(i).click();
        }
        getDriver().pressKeyCode(AndroidKeyCode.BACK);
        return this;
    }
    public NearbyPOIView checkingIfEmptyListMessageIsDisplayed()throws MalformedURLException {
        assertTrue(POI_LIST_EMPTY_MESSAGE.isDisplayed());
        Actions.takeScreenshot("Empty list message is displaying...");
        return this;
    }

    public NearbyPOIView clickingIbomboPoi() throws MalformedURLException {
        IBOMBO.click();
        Actions.takeScreenshot("IBOMBO clicked...");
        openingPOIdrawer();
        Actions.takeScreenshot("IBOMBO opened...");
        return this;
    }
    public NearbyPOIView clickingVeturiloPoi() throws MalformedURLException {
        VETURILO.click();
        Actions.takeScreenshot("VETURILO clicked...");
        openingPOIdrawer();
        Actions.takeScreenshot("VETURILO opened...");
        return this;
    }
    public NearbyPOIView clickingBicycleParkingPoi() throws MalformedURLException {
        BICYCLE_PARKING.click();
        Actions.takeScreenshot("Bicycle parking clicked...");
        openingPOIdrawer();
        Actions.takeScreenshot("Bicycle parking opened...");
        return this;
    }

    public NearbyPOIView openingPOIdrawer()throws MalformedURLException{
        TouchAction action = new TouchAction((getDriver()));
        action.longPress(element(POI_HANDLE)).moveTo(element(MAIN_TOOLBAR)).release().perform();
        return this;
    }
    //ALL POI
    public NearbyPOIView checkingIfPoiTitleOnPoiIsDisplayed(){
        assertTrue(POI_TITLE.isDisplayed());
        return this;
    }

    //All POI
    public NearbyPOIView checkingIfReportIssueButtonOnPoiIsDisplayed(){
        assertTrue(REPORT_ISSUE.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiAddressOnPoiIsDisplayed(){
        assertTrue(POI_ADDRESS.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiImageOnPoiIsDisplayed(){
        assertTrue(POI_IMAGE.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiMoreInfoIsDisplayed(){
        assertTrue(POI_MORE_INFO.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiFacebookIsDisplayed(){
        assertTrue(POI_FACEBOOK.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiEmailIsDisplayed(){
        assertTrue(POI_EMAIL.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiWebsiteIsDisplayed(){
        assertTrue(POI_WEBSITE.isDisplayed());
        return this;
    }
    //VETURILO and PARKING ROWEROWY
    public NearbyPOIView checkingIfPoiCounterIsDisplayed(){
        assertTrue(POI_COUNTER.isDisplayed());
        return this;
    }
    //IBOMBO
    public NearbyPOIView checkingIfPoiTagsOnIbomboAreDisplayed(){
        assertTrue(POI_TAGS_ON_IBOMBO.isDisplayed());
        return this;
    }

}
