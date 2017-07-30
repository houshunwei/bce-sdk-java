/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce;

import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.vca.VcaClient;
import com.baidubce.services.vca.model.GetMediaResponse;
import com.baidubce.services.vca.model.PutMediaResponse;


/**
 * Vcr Demo.
 *
 * @author dingshenglong
 */
public class VcaDemo {

    public static void main(String[] args) {
        String ak = "YourAK";
        String sk = "YourSK";

        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));

        VcaClient client = new VcaClient(config);

        String mediaId = "YourVODMediaId";
        PutMediaResponse put = client.putMedia(mediaId);
        System.out.println(put);
        // wait for some time or use notification
        GetMediaResponse get = client.getMedia(mediaId);
        System.out.println(get);
    }

}
