<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:xd="http://www.oxygenxml.com/ns/doc/xsl"
    xmlns:r="http://elpri.di.uminho.pt/report"
    xmlns:p="http://elpri.di.uminho.pt/paragraph"
    exclude-result-prefixes="xs xd"
    version="2.0">
    <xd:doc scope="stylesheet">
        <xd:desc>
            <xd:p><xd:b>Created on:</xd:b> Dec 15, 2014</xd:p>
            <xd:p><xd:b>Author:</xd:b> jcr</xd:p>
            <xd:p></xd:p>
        </xd:desc>
    </xd:doc>
    
    <xsl:template match="r:section">
        <h2>
            <xsl:value-of select="r:title"/>
        </h2>
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="r:section/p:p">
        <p>
            <xsl:value-of select="."/>
        </p>
    </xsl:template>
    
    <xsl:template match="text()" priority="-1"/>
    
</xsl:stylesheet>