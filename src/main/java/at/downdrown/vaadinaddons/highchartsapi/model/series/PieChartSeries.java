/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.PieChartData;
import at.downdrown.vaadinaddons.highchartsapi.model.data.base.*;

import java.util.ArrayList;
import java.util.List;

public class PieChartSeries extends HighChartsSeriesImpl {

    private List<PieChartData> data = new ArrayList<PieChartData>();
    private String innerSize;
    private Float borderWidth;

    public PieChartSeries(String name) {
        this.chartType = ChartType.PIE;
        this.name = name;
    }

    public List<PieChartData> getData() {
        return data;
    }

    public void setData(List<PieChartData> data) {
        this.data = data;
    }
    
    /**
     * The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers.
     */
    public void setInnerSize(String innerSize) {
	this.innerSize = innerSize;
    }
    
    /**
     * The width of the border surrounding each slice. When setting the border
     * width to 0, there may be small gaps between the slices due to SVG
     * antialiasing artefacts. To work around this, keep the border width at 0.5
     * or 1, but set the borderColor to null instead. Defaults to 1.
     */
    public void setBorderWidth(Float borderWidth) {
    	this.borderWidth = borderWidth;
    }

    public String getHighChartValue() {

        StringBuilder builder = new StringBuilder();
        builder.append("{ name: '" + this.name + "', data: [");

        int count = 1;
        if (getData() != null) {

            for (PieChartData data : getData()) {
                if (count == 1) {
                    builder.append(data.getHighChartValue());
                } else if (count > 1) {
                    builder.append(",");
                    builder.append(data.getHighChartValue());
                }
                count++;
            }
        }
        builder.append("]");
        
        if (this.innerSize!=null) {
            builder.append(", innerSize: '" + this.innerSize + "'");
        }
        
        if (this.borderWidth != null) {
		builder.append(", borderWidth: " + this.borderWidth);
	}
        
        builder.append("}");

        return builder.toString();
    }

    public void addData(PieChartData pieChartData) {
        this.data.add(pieChartData);
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleDoubleData doubleDoubleData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(DoubleIntData doubleIntData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntDoubleData intDoubleData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(IntIntData intIntData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringDoubleData stringDoubleData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }

    /**
     * @deprecated This method isn't implemented for this type.
     * Use {@link #addData(PieChartData)} instead.
     */
    @Deprecated
    @Override
    public void addData(StringIntData stringIntData) {
        throw new UnsupportedOperationException("Pie charts only accept PieChartData objects.");
    }
}


