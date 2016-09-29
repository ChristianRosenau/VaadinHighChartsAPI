package at.downdrown.vaadinaddons.highchartsapi.model.lang;

public class EnglishLanguageOptions extends AbstractLanguageOptions {
    
    protected static final String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    protected static final String[] shortWeekdays = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
    protected static final String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    protected static final String[] shortMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    protected static final String thousandsSep = " ";
    protected static final String decimalPoint = ".";
    
    protected static final String loading = "Loading...";
    protected static final String noData = "No data to display";
    
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
