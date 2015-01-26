<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:xd="http://www.oxygenxml.com/ns/doc/xsl"
    xmlns:r="http://elpri.di.uminho.pt/report"
    xmlns:p="http://elpri.di.uminho.pt/paragraph"
    xmlns:l="http://elpri.di.uminho.pt/list"
    xmlns:img="http://elpri.di.uminho.pt/image"
    xmlns:t="http://elpri.di.uminho.pt/table"
    
    exclude-result-prefixes="xs xd"
    version="1.0">
    <xd:doc scope="stylesheet">
        <xd:desc>
            <xd:p><xd:b>Created on:</xd:b> Dec 15, 2014</xd:p>
            <xd:p></xd:p>
        </xd:desc>
    </xd:doc>
    
    <xsl:output method="html" indent="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"/>
                <script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
                <title>Relatório</title>
            </head>
            <body>
                <xsl:apply-templates select="r:report" />
                <address>Generated by </address>
                <hr/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="r:report">
        <xsl:apply-templates select="r:front-matter" />
        <hr />
        <xsl:apply-templates select="r:body" />
        <hr />
        <xsl:apply-templates select="r:back-matter" />
    </xsl:template>
    
    <xsl:template match="r:front-matter">
        <div class="col-xs-12 text-center">
            <xsl:apply-templates select="r:meta"/>
        </div>
    </xsl:template>
            
    <xsl:template match="r:meta">
        <h2>
            <xsl:value-of select="r:title"/>
        </h2>
        <h3>
            <xsl:value-of select="r:subtitle"/>
        </h3>
        <xsl:apply-templates select="r:authors" />
    </xsl:template>
    
    <xsl:template match="r:authors">
        <div class="col-xs-3" />
        <xsl:apply-templates select="//r:author" />
        <div class="col-xs-3" />
    </xsl:template>
    
    <xsl:template match="r:author">
        <div class="col-xs-2">
            
            
            
            <name>Bruno Ferreira</name>
            <identifier>a61055</identifier>
            <email></email>
            <photo path=""/>
        </div>
    </xsl:template>
        
    <xsl:template match="//body">
        <div class="col-xs-12">
            <xsl:apply-templates/>
        </div>
    </xsl:template>
        
    <xsl:template match="//back-matter">
        <div class="col-xs-12">
            <xsl:apply-templates/>
        </div>
    </xsl:template>
    
</xsl:stylesheet>