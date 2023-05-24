package com.example.task;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
@Table(name = "DOC")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long docId;

    private String docType;
    private String encDoc;
    private String uploadedBy;

    @Column(name = "created")
    private LocalDateTime created;

    private String region;
    byte[] bytearray;

	public byte[] getBytearray() {
		return bytearray;
	}

	public void setBytearray(byte[] bytearray) {
		this.bytearray = bytearray;
	}

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getEncDoc() {
		return encDoc;
	}

	public void setEncDoc(String encDoc) {
		this.encDoc = encDoc;
	}

	public String getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Document [docId=" + docId + ", docType=" + docType + ", encDoc=" + encDoc + ", uploadedBy=" + uploadedBy
				+ ", created=" + created + ", region=" + region + ", bytearray=" + Arrays.toString(bytearray) + "]";
	}

	public Document() {
		super();
	}

	public Document(Long docId, String docType, String encDoc, String uploadedBy, LocalDateTime created, String region,
			byte[] bytearray) {
		super();
		this.docId = docId;
		this.docType = docType;
		this.encDoc = encDoc;
		this.uploadedBy = uploadedBy;
		this.created = created;
		this.region = region;
		this.bytearray = bytearray;
	}

	

   
}