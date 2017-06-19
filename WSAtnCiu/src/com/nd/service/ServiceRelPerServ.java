package com.nd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nd.bean.Archivos;
import com.nd.bean.RelPerServ;
import com.nd.bean.ServicioPadre;
import com.nd.bean.Usuario;
import com.nd.dao.DAORelPerServ;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

@Service("countryServiceReport") 
public class ServiceRelPerServ {
	 @Autowired  
	 DAORelPerServ daoReport; 
	 
	 @Transactional  
	 public void updateRelPerServ(RelPerServ objRelPerServ) {  
	 	daoReport.updateRelPerServ(objRelPerServ);  
	 }
	 
	 @Transactional
	 public List<RelPerServ> getRelPerSerByIdUser(Usuario objUsuario){
		 List<RelPerServ> list = daoReport.getRelPerSerByIdUser(objUsuario); 
		 return list;
	 }
	 @Transactional
		public List<RelPerServ> getRelPerSerByIdService(ServicioPadre objServicioPadre){
		 List<RelPerServ> list = daoReport.getRelPerSerByIdService(objServicioPadre); 
		 return list;
	 }
    @Transactional
    public String getUltimoFolio(String flNomenclatura) {
        return daoReport.getUltimoFolio(flNomenclatura);
    }
    
    @Transactional
    public RelPerServ getRelPerSerById(Integer idRelPerServ){
    	return daoReport.getRelPerSerById(idRelPerServ);
    }
	 
	 @Transactional
	 public List<Integer> getFilesByIdUsuCatServ(Integer rpcIdusucatser){
		 return daoReport.getFilesByIdUsuCatServ(rpcIdusucatser);
	 }
	 
	 @Transactional
	 public byte[] getImageByArcIdArchivo(Integer arcIdArchivo) {
		 return daoReport.getImageByArcIdArchivo(arcIdArchivo);
	 }
	 
	 @Transactional
	 public String getImage64ByArcIdArchivo(Integer arcIdArchivo) {
		 byte[] vlByteImage = daoReport.getImageByArcIdArchivo(arcIdArchivo);
		 BASE64Encoder encoder = new BASE64Encoder();
		 Archivos 	vlArchivos = new Archivos();
		  vlArchivos.setArcIdArchivo(arcIdArchivo);
		  vlArchivos.setArchivoStr(encoder.encode(vlByteImage));
		  ObjectMapper mapper = new ObjectMapper();
		  String jsonInString = "";
		  try {
			jsonInString = mapper.writeValueAsString(vlArchivos);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  return jsonInString;
	 }
	 
	 private BufferedImage convertByteArrayToBufferedImage(byte[] imageInByte) throws IOException {
		 InputStream in = new ByteArrayInputStream(imageInByte);
		 BufferedImage bImageFromConvert = ImageIO.read(in);
		 return bImageFromConvert;
	 }
	 
	 private byte[] convertBufferedImageToByteArray(BufferedImage originalImage) throws IOException{
		 ByteArrayOutputStream baos = new ByteArrayOutputStream();
		 ImageIO.write(originalImage, "jpg", baos);
		 baos.flush();
		 byte[] imageInByte = baos.toByteArray();
		 baos.close();
		 return imageInByte;
	 }
	 
	 private BufferedImage resizeImageWithHint(BufferedImage originalImage, int width, int height){
		  
			BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = resizedImage.createGraphics();
			g.drawImage(originalImage, 0, 0, width, height, null);
			g.dispose();
			g.setComposite(AlphaComposite.Src);
			g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
			RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			g.setRenderingHint(RenderingHints.KEY_RENDERING,
			RenderingHints.VALUE_RENDER_QUALITY);
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			RenderingHints.VALUE_ANTIALIAS_ON);
			return resizedImage;
			
		 /*
		   BufferedImage bdest = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		   Graphics2D g = bdest.createGraphics();
		   AffineTransform at = AffineTransform.getScaleInstance((double)width / originalImage.getWidth(),
				   				(double)height / originalImage.getHeight());
		   g.drawRenderedImage(originalImage,at);
		   return bdest;
		   */
	 }
	 
	 @Transactional
	 public String getImage64SizeByArcIdArchivo(Integer arcIdArchivo, Integer width, Integer height) {
		 byte[] vlByteImage = daoReport.getImageByArcIdArchivo(arcIdArchivo);
		 if (!(vlByteImage != null && vlByteImage.length > 0)) {
			 return "";
		 }
		 
		 String vlResultBase64 = "";
			try {
				BufferedImage vlBufferedImage = convertByteArrayToBufferedImage(vlByteImage);
				// BufferedImage scaledImg = Scalr.resize(vlBufferedImage, Scalr.Method.AUTOMATIC, width, height);
				BufferedImage scaledImg = resizeImageWithHint(vlBufferedImage, width, height);
				byte[] vlByteImageScaled = convertBufferedImageToByteArray(scaledImg);
				BASE64Encoder encoder = new BASE64Encoder();
				vlResultBase64 = encoder.encode(vlByteImageScaled);
			} catch (IOException e) {
				e.printStackTrace();
			}
		  Archivos 	vlArchivos = new Archivos();
		  vlArchivos.setArcIdArchivo(arcIdArchivo);
		  vlArchivos.setArchivoStr(vlResultBase64);
		  ObjectMapper mapper = new ObjectMapper();
		  String jsonInString = "";
		  try {
			jsonInString = mapper.writeValueAsString(vlArchivos);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  return jsonInString;
	 }
	 
	 @Transactional
	 public String getRelPerSerAlert(RelPerServ objRelPerServ){
		 String JSON = "";
		 Integer alertId = daoReport.addRelPerSerAlert(objRelPerServ);
		 JSON = "{\"alertId\":" + alertId + "}";
		 return JSON;  
	 }
	 
	 @Transactional
	 public void getRelPerSerArchivos(Archivos objArchivos){
		 // Codificar
		 //Base64.Decoder decoder = Base64.getDecoder();	byte[] decodedByteArray = decoder.decode(objArchivos.getArchivoStr());
		 BASE64Decoder decoder = new BASE64Decoder();
		 byte[] imageByte = null;
		 
		 try{
		 	imageByte = decoder.decodeBuffer(objArchivos.getArchivoStr());
		 } catch(Exception ex){
			 ex.printStackTrace();
		 }
		 
		 // Actualizar Variables
		 objArchivos.setArcArchivo(imageByte);
		 objArchivos.setArchivoStr("OK");
		 
		 // DAO
		 daoReport.addRelPerSerArchivos(objArchivos);
	 }
	 
	 @Transactional  
	 public void deleteReports(Integer idReport) {  
	 	daoReport.deleteReports(idReport);  
	 }
}
