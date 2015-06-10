package model;

import android.text.Editable;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;

/**
 * Created by mountin on 10.06.2015.
 */
@Table(name="NumberLists")
public class NumberList extends Model {
    public String number;
    public int blockTimeType;
    public int unblockedUnixTime;
}


