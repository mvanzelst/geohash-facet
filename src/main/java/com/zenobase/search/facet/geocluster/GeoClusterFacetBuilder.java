package com.zenobase.search.facet.geocluster;

import java.io.IOException;

import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.search.facet.AbstractFacetBuilder;

public class GeoClusterFacetBuilder extends AbstractFacetBuilder {

	private final String fieldName;
	private final double factor;

	public GeoClusterFacetBuilder(String name, String fieldName, double factor) {
		super(name);
		this.fieldName = fieldName;
		this.factor = factor;
	}

	@Override
	public XContentBuilder toXContent(XContentBuilder builder, Params params) throws IOException {
		builder.startObject(name);
		builder.startObject(GeoClusterFacet.TYPE);
		builder.field("field", fieldName);
		builder.field("factor", factor);
		builder.endObject();
		builder.endObject();
		return builder;
	}
}
