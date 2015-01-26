<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xd="http://www.oxygenxml.com/ns/doc/xsl"
    xmlns:r="http://elpri.di.uminho.pt/report" xmlns:p="http://elpri.di.uminho.pt/paragraph"
    xmlns:l="http://elpri.di.uminho.pt/list" xmlns:img="http://elpri.di.uminho.pt/image"
    xmlns:t="http://elpri.di.uminho.pt/table" exclude-result-prefixes="xs xd" version="1.0">
    <xd:doc scope="stylesheet">
        <xd:desc>
            <xd:p><xd:b>Created on:</xd:b> Dec 15, 2014</xd:p>
            <xd:p/>
        </xd:desc>
    </xd:doc>
    
    <xsl:key name="seccoes" match="r:section|r:subsection|r:subsubsection" use="@id"/>
    
    <xsl:output method="html" indent="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet"
                    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"/>
                <script src="https://code.jquery.com/jquery-1.11.0.min.js"/>
                <style type="text/css">
                    .col-center{
                        float:none;
                        margin-left:auto;
                        margin-right:auto;
                    }</style>
                <title>Relatório</title>
            </head>
            <body>
                <div class="container">
                    <xsl:apply-templates select="r:report"/>
                    <hr/>
                </div>
            </body>
        </html>
    </xsl:template>


    <!--*********************************
        Report
    **********************************-->

    <xsl:template match="r:report">
        <xsl:apply-templates select="r:front-matter"/>
        <hr/>
        <xsl:apply-templates select="r:body"/>
        <hr/>
        <xsl:apply-templates select="r:back-matter"/>
    </xsl:template>

    <xsl:template match="r:front-matter">
        <xsl:apply-templates select="r:meta"/>
        <xsl:apply-templates select="r:abstract"/>
        <xsl:apply-templates select="r:toc"/>
        <xsl:apply-templates select="r:lot"/>
        <xsl:apply-templates select="r:lof"/>
    </xsl:template>

    <xsl:template match="r:toc">
        <div class="col-md-12 text-center">
            <div class="row">
                <p class="bg-danger">Table of contents</p>
                
            </div>
        </div>
    </xsl:template>

    <xsl:template match="r:lot">
        <div class="col-md-12 text-center">
            <div class="row">
                <p class="bg-danger">List of Tables</p>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="r:lof">
        <div class="col-md-12 text-center">
            <div class="row">
                <p class="bg-danger">List of Figures</p>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="r:meta">
        <div class="col-md-12 text-center">
            <div class="row">
                <div class="col-md-12">
                    <h2>
                        <xsl:value-of select="r:title"/>
                    </h2>
                    <h3>
                        <xsl:value-of select="r:subtitle"/>
                    </h3>
                </div>
            </div>
            <div class="row">
                <xsl:apply-templates select="r:authors"/>
            </div>
            <div class="row" style="margin-top:30px">
                <div class="col-md-12">
                    <div class="row">
                        <h4>
                            <xsl:value-of select="r:date"/>
                        </h4>
                    </div>
                    <div class="row">
                        <h4>
                            <xsl:value-of select="r:affil"/>
                        </h4>
                    </div>
                </div>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="r:authors">
        <div class="col-md-6 col-center">
            <xsl:apply-templates select="//r:author"/>
        </div>
    </xsl:template>

    <xsl:template match="r:author">
        <div class="col-md-4">
            <div class="row">
                <strong>
                    <xsl:value-of select="r:name"/>
                </strong>
            </div>
            <div class="row">
                <xsl:value-of select="r:identifier"/>
            </div>
            <div class="row">
                <a href="mailto:{r:email}">
                    <xsl:value-of select="r:email"/>
                </a>
            </div>
            <div class="row">
                <img style="width: 100px" src="{r:photo/@path}"/>
            </div>
        </div>
    </xsl:template>

    <xsl:template match="r:body">
        <div class="col-md-12">
            <xsl:apply-templates select="r:section"/>
        </div>
    </xsl:template>

    <xsl:template match="r:section">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="r:section/r:title">
        <h2>
            <xsl:value-of select="."/>
        </h2>
    </xsl:template>

    <xsl:template match="r:subsection">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="r:subsection/r:title">
        <h3>
            <xsl:value-of select="."/>
        </h3>
    </xsl:template>

    <xsl:template match="r:subsubsection">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="r:subsubsection/r:title">
        <h4>
            <xsl:value-of select="."/>
        </h4>
    </xsl:template>

    <xsl:template match="r:back-matter">
        <div class="col-md-12">
            <div class="row">
                <xsl:apply-templates/>
            </div>
        </div>
    </xsl:template>

    <!--*********************************
        Parágrafo
    **********************************-->

    <xsl:template match="p:p">
        <p>
            <xsl:apply-templates/>
        </p>
    </xsl:template>

    <xsl:template match="p:b">
        <strong>
            <xsl:apply-templates/>
        </strong>
    </xsl:template>

    <xsl:template match="p:i">
        <em>
            <xsl:apply-templates/>
        </em>
    </xsl:template>

    <xsl:template match="p:u">
        <u>
            <xsl:apply-templates/>
        </u>
    </xsl:template>

    <xsl:template match="p:xref">
        <a href="{@href}">
            <xsl:value-of select="."/>
        </a>
    </xsl:template>

    <xsl:template match="p:ackr">
        <abbr title="{@expansion}">
            <xsl:value-of select="."/>
        </abbr>
    </xsl:template>

    <xsl:template match="p:cite">
        <cite title="{@bibref}">
            <xsl:value-of select="."/>
        </cite>
    </xsl:template>

    <xsl:template match="p:code">
        <pre>
            <xsl:value-of select="."/>
        </pre>
    </xsl:template>

    <!--*********************************
        Image
    **********************************-->
    <xsl:template match="img:image">
        <div class="col-center text-center">
            <img src="{@path}"/>
            <br/>
            <xsl:value-of select="."/>
        </div>


    </xsl:template>

    <!--*********************************
        List
    **********************************-->

    <xsl:template match="l:ol">
        <ol>
            <xsl:apply-templates/>
        </ol>
    </xsl:template>

    <xsl:template match="l:ul">
        <ul>
            <xsl:apply-templates/>
        </ul>
    </xsl:template>

    <xsl:template match="l:dl">
        <dl>
            <xsl:apply-templates/>
        </dl>
    </xsl:template>

    <xsl:template match="l:dt">
        <dt>
            <xsl:value-of select="."/>
        </dt>
    </xsl:template>

    <xsl:template match="l:dd">
        <dd>
            <xsl:apply-templates/>
        </dd>
    </xsl:template>

    <xsl:template match="l:li">
        <li>
            <xsl:apply-templates/>
        </li>
    </xsl:template>

    <!--*********************************
        Table
    **********************************-->

    <xsl:template match="t:table">
        <table>
            <xsl:apply-templates/>
        </table>
    </xsl:template>

    <xsl:template match="th">
        <th>
            <xsl:value-of select="."/>
        </th>
    </xsl:template>

    <xsl:template match="td">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>

</xsl:stylesheet>
