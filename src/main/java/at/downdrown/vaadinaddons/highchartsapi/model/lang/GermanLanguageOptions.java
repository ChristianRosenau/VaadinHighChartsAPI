package at.downdrown.vaadinaddons.highchartsapi.model.lang;

public class GermanLanguageOptions extends AbstractLanguageOptions {
    
    protected static final String[] weekdays = { "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag" };
    protected static final String[] shortWeekdays = { "So", "Mo", "Di", "Mi", "Do", "Fr", "Sa" };
    protected static final String[] months = { "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember" };
    protected static final String[] shortMonths = { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" };

    protected static final String thousandsSep = ".";
    protected static final String decimalPoint = ",";
    
    protected static final String loading = "Wird geladen...";
    protected static final String noData = "Keine Daten vorhanden";
    
    @Override
    public String[] getWeekdays() {
	return weekdays;
    }
    
    @Override
    public String[] getShortWeekdays() {
	return shortWeekdays;
    }
    
    @Override
    public String[] getMonths() {
	return months;
    }
    
    @Override
    public String[] getShortMonths() {
	return shortMonths;
    }
    
    @Override
    public String getThousandsSep() {
	return thousandsSep;
    }
    
    @Override
    public String getDecimalPoint() {
	return decimalPoint;
    }
    
    @Override
    public String getLoading() {
	return loading;
    }
    
    @Override
    public String getNoData() {
        return noData;
    }
}
