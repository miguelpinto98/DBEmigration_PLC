<schema xmlns="http://purl.oclc.org/dsdl/schematron">
  <title>Verifica a Existência de Nomes no Texto</title>

  <pattern name="Validar Texto">
    <rule context="//texto">
      <assert test="nome">Nome não existe no XML</assert>
    </rule>
  </pattern>
</schema>
