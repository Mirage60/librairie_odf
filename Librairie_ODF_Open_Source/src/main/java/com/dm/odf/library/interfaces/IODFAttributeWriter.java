package com.dm.odf.library.interfaces;

import com.dm.odf.library.core.ODFConstants.ODF_ATTRIBUTE_ID;

public interface IODFAttributeWriter extends IODFXmlWriter
{

	public ODF_ATTRIBUTE_ID   getAttributeID();
	public IODFAttributeValue getValue();

}
