/*
 * Copyright (C) 2013
 *     Arnav Gupta
 *     Saurav Tomar
 *     Umair Khan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package in.ac.dtu.subtlenews;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/**
 * Utility class which includes stuffs that wll be used at various places
 */

public class Utils {

    public static String[] categoryMap = {"India", "World", "Entertainment" , "Technology", "Business","Science" , "Sports", "Health"};

    public static boolean isNetworkConnected(Context context) {

        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo ni = cm.getActiveNetworkInfo();
            if (ni == null) {
                // There are no active networks.
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean isBelowHolo() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
            return false;
        else
            return true;
        }
}