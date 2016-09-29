package at.downdrown.vaadinaddons.highchartsapi.model.lang;

public class CustomLanguageOptions extends AbstractLanguageOptions {
    
    protected String[] weekdays;
    protected String[] shortWeekdays;
    protected String[] months;
    protected String[] shortMonths;

    protected String thousandsSep;
    protected String decimalPoint;
    
    protected String loading;
    protected String noData;
    
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

    public void setWeekdays(String[] weekdays) {
        this.weekdays = weekdays;
    }

    public void setShortWeekdays(String[] shortWeekdays) {
        this.shortWeekdays = shortWeekdays;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public void setShortMonths(String[] shortMonths) {
        this.shortMonths = shortMonths;
    }

    public void setThousandsSep(String thousandsSep) {
        this.thousandsSep = thousandsSep;
    }

    public void setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    public void setLoading(String loading) {
        this.loading = loading;
    }
    public void setNoData(String noData) {
	this.noData = noData;
    }
}
