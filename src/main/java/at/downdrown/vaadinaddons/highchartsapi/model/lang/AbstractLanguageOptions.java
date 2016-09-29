package at.downdrown.vaadinaddons.highchartsapi.model.lang;

import at.downdrown.vaadinaddons.highchartsapi.model.HighchartsObject;

public abstract class AbstractLanguageOptions implements HighchartsObject {

    @Override
    public String getHighChartValue() {
	StringBuilder sb = new StringBuilder();
	if (getWeekdays() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("weekdays: " + arrayToString(getWeekdays()));
	}
	if (getShortWeekdays() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("shortWeekdays: " + arrayToString(getShortWeekdays()));
	}
	if (getMonths() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("months: " + arrayToString(getMonths()));
	}
	if (getShortMonths() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("shortMonths: " + arrayToString(getShortMonths()));
	}
	if (getThousandsSep() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("thousandsSep: '" + getThousandsSep() + "'");
	}
	if (getDecimalPoint() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("decimalPoint: '" + getDecimalPoint() + "'");
	}
	if (getLoading() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("loading: '" + getLoading() + "'");
	}
	if (getNoData() != null) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("noData: '" + getNoData() + "'");
	}

	return "{" + sb.toString() + "}";
    }

    protected String arrayToString(String[] array) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < array.length; i++) {
	    if (sb.length() > 0) {
		sb.append(",");
	    }
	    sb.append("'").append(array[i].replaceAll("'","\\'")).append("'");
	}
	return "[" + sb.toString() + "]";
    }

    public abstract String[] getWeekdays();

    public abstract String[] getShortWeekdays();

    public abstract String[] getMonths();

    public abstract String[] getShortMonths();

    public abstract String getThousandsSep();

    public abstract String getDecimalPoint();

    public abstract String getLoading();

    public abstract String getNoData();
}
