package org.coryphaei.query.parser;

import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;

/**
 * Created by twist on 2017-07-27.
 */
public class ZWOrderParser {

    public static FieldSortBuilder fieldSortBuilder(JSONObject config, JSONObject data) {
        FieldSortBuilder fieldSortBuilder = new FieldSortBuilder(JSONValueParser.getValue(config.getString("field"), data));
        if (config.getString("order") != null) {
            String order = JSONValueParser.getValue(config.getString("order"), data);
            fieldSortBuilder.order(SortOrder.valueOf(order.toUpperCase()));
        }

        return fieldSortBuilder;
    }
}
