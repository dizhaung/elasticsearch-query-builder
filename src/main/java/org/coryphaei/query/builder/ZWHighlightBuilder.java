package org.coryphaei.query.builder;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.search.highlight.HighlightBuilder;

/**
 * Created by zhengzhihao on 2017/10/25.
 */
public class ZWHighlightBuilder {

    public static HighlightBuilder getHighlightBuilder(JSONArray hightLightArr) {
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        hightLightArr.forEach(item -> {
            if (item != null) {
                highlightBuilder.field(((JSONObject) item).getString("field"),((JSONObject) item).getInteger("fragment_size"),((JSONObject) item).getInteger("number_of_fragment"));
            }
        });

        return highlightBuilder;
    }
}
