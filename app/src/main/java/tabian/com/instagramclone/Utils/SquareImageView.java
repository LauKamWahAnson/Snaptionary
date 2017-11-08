package tabian.com.instagramclone.Utils;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by AnsonLau on 9/11/2017.
 */

public class SquareImageView extends AppCompatImageView {

    public SquareImageView(Context context){
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
