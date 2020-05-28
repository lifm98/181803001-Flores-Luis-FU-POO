public class AvisosMain 
{
    public static void main(String args[])
    {
        Avisos General = new Avisos();
        General.id = "12345";
        General.tipoAviso = "General";
        General.titulo = "Insumos y bienes muebles de laboratorio disponibles";
        General.autor = "Eduardo Flores Días";
        General.texto ="La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, "
                + "\npone a disposición del personal que realiza investigación el inventario adjunto.";
        General.resumen = " Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)";
        General.fechaP = "02/02/2020";
        General.fechaA = "02/02/2020";
        General.fechaF = "02/02/2021";
        General.estatus = "Vigente";
        
        Avisos Conferencia = new Avisos();
        Conferencia.id = "67890";
        Conferencia.tipoAviso = "Conferencia";
        Conferencia.titulo = "CONFERENCIA DR. COSSARIZZA";
        Conferencia.autor = "Kevin Meza Gonzalez";
        Conferencia.texto = "Texto del aviso :El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced "
                + "\nCytometry” y aprovechó la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados "
                + "\nde investigación, aún no publicados, sobre VIH y el uso de citometría de flujo." 
                + "\n\n\nAdemás, invitó a nuestra comunidad a agregarse a la sociedad internacional sobre citometría: ISAC(International Society for the Advancement of Cytometry) y aprovechar los recursos que tienen como:\n" +
                "\n" +
                "Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas\n" +
                "Iniciativa de innovación CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en productos comerciales de alto impacto para ayudar a nuevos empresarios a aprovechar la tecnología de citometría\n" +
                "\n" +
                "Además en la ISAC tienen disponibles una serie de manuales e información de punta sobre la citometría para uso libre. El Dr. Cossarizza reiteró la invitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando el prestigio que tiene el Laboratorio de Citometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.";
        Conferencia.resumen = "Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry";
        Conferencia.fechaP = "02/03/2020";
        Conferencia.fechaA = "15/02/2020";
        Conferencia.fechaF = "31/03/2020";
        Conferencia.estatus = "No vigente";
        
        System.out.println(General.toString());
        System.out.println(Conferencia.toString());
    }
}
