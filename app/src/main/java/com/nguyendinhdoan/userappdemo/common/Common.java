package com.nguyendinhdoan.userappdemo.common;

import com.nguyendinhdoan.userappdemo.remote.FCMClient;
import com.nguyendinhdoan.userappdemo.remote.IFCMService;

public class Common {

    public static final String driver_tbl = "driversLocation";
    public static final String user_driver_tbl = "driversTable";
    public static final String user_rider_tbl = "usersTable";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "tokens";

    public static final String fcmFURL = "https://fcm.googleapis.com";

    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmFURL).create(IFCMService.class);
    }
}
