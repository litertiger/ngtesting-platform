package com.ngtesting.platform.service.impl;

import com.ngtesting.platform.model.Document;
import com.ngtesting.platform.service.DocumentService;
import com.ngtesting.platform.utils.BeanUtilEx;
import com.ngtesting.platform.vo.Page;
import com.sun.tools.doclets.formats.html.markup.DocType;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DocumentServiceImpl extends BaseServiceImpl implements DocumentService {

	@Override
	public Page listByPage(Integer eventId, Integer currentPage, Integer itemsPerPage, DocType type) {
//        DetachedCriteria dc = DetachedCriteria.forClass(Document.class);
//        dc.add(Restrictions.eq("eventId", eventId));
//
//        if (type != null) {
//        	dc.add(Restrictions.eq("docType", type));
//        }
//
//        dc.add(Restrictions.eq("deleted", Boolean.FALSE));
//        dc.add(Restrictions.eq("disabled", Boolean.FALSE));
//        dc.addOrder(Order.asc("id"));
//        Page page = findPage(dc, currentPage * itemsPerPage, itemsPerPage);
//
//        return page;

		return null;
	}

	@Override
	public Document save(Document vo) {
//		if (vo == null) {
//			return null;
//		}
//
//		Document po = new Document();
//		if (vo.getId() != null) {
//			po = (Document) get(Document.class, vo.getId());
//		}
//
//		po.setEventId(vo.getEventId());
//		po.setTitle(vo.getTitle());
//		po.setUri(vo.getUri());
//
//		saveOrUpdate(po);
//		return po;

		return null;
	}

	@Override
	public boolean remove(Long id) {
//		Document po = (Document) get(Document.class, id);
//		po.setDeleted(true);
//		saveOrUpdate(po);

		return true;
	}

	@Override
	public List<Document> genVos(List<Document> pos) {
        List<Document> vos = new LinkedList<Document>();
        for (Document po: pos) {
        	Document vo = genVo(po);
        	vos.add(vo);
        }
		return vos;
	}
	@Override
	public Document genVo(Document po) {

    	Document vo = new Document();
    	BeanUtilEx.copyProperties(vo, po);

		return vo;
	}

}