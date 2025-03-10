package mcjty.theoneprobe.apiimpl.styles;

import mcjty.theoneprobe.api.ElementAlignment;
import mcjty.theoneprobe.api.ITextStyle;

public class TextStyle implements ITextStyle {

    private int top = 0;
    private int bottom = 0;
    private int left = 0;
    private int right = 0;
    private Integer width = null;
    private Integer height = null;
    private ElementAlignment align = ElementAlignment.ALIGN_TOPLEFT;
    
    @Override
    public ITextStyle copy() {
    	return new TextStyle().bottomPadding(bottom).leftPadding(left).rightPadding(right).topPadding(top).bounds(width, height).alignment(align);
    }
    
    @Override
    public TextStyle topPadding(int padding) {
        top = padding;
        return this;
    }

    @Override
    public TextStyle bottomPadding(int padding) {
        bottom = padding;
        return this;
    }

    @Override
    public TextStyle leftPadding(int padding) {
        left = padding;
        return this;
    }

    @Override
    public TextStyle rightPadding(int padding) {
        right = padding;
        return this;
    }

    @Override
    public TextStyle alignment(ElementAlignment align) {
        this.align = align;
        return this;
    }

    @Override
    public TextStyle width(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public TextStyle height(Integer height) {
        this.height = height;
        return this;
    }


    @Override
    public int getLeftPadding() {
        return left;
    }

    @Override
    public int getRightPadding() {
        return right;
    }

    @Override
    public int getTopPadding() {
        return top;
    }

    @Override
    public int getBottomPadding() {
        return bottom;
    }

    @Override
    public ElementAlignment getAlignment() {
        return align;
    }

    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public Integer getHeight() {
        return height;
    }

}
