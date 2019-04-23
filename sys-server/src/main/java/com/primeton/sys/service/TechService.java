package com.primeton.sys.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.page.PageMethod;
import com.primeton.sys.model.IArticle;
import com.primeton.sys.model.IFile;
import com.primeton.sys.annotation.ServiceLog;
import com.primeton.sys.mapper.IFileMapper;
import com.primeton.sys.pojo.AjaxResult;
import com.primeton.sys.pojo.PageAjax;
import com.primeton.sys.utils.AppUtil;
import com.primeton.sys.utils.DateUtil;

/**
 * 文件管理
 * ClassName: TechService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月17日 下午1:39:37 <br/>
 *
 * @author Jin.He (mailto:hejin@primeton.com)
 * @version
 */
@Service
public class TechService extends AbstratService<IArticle> {
	
	@Autowired
	private IFileMapper fileMapper;

	@ServiceLog("查询文件列表")
	public PageAjax<IFile> queryFilePage(PageAjax<IFile> page, IFile file) {
		PageMethod.startPage(page.getPageNo(), page.getPageSize());
		List<IFile> list = fileMapper.selectAll();
		return AppUtil.returnPage(list);
	}

	@ServiceLog("新增文件")
	public AjaxResult addFile(IFile file) {
		file.setAddtime(DateUtil.getCurDateTime());
		fileMapper.insert(file);
		return AppUtil.returnObj(null);
	}

	public IFile queryFileByID(int id) {
		return fileMapper.selectByPrimaryKey(id);
	}

	@ServiceLog("更新文件")
	public AjaxResult updateFile(IFile file) {
		fileMapper.updateByPrimaryKeySelective(file);
		return AppUtil.returnObj(null);
	}

	@ServiceLog("删除文件")
	public AjaxResult delFile(int id) {
		IFile file = queryFileByID(id);
		if(null != file){
			fileMapper.deleteByPrimaryKey(id);
			File f = new File(file.getSavepath());
	        if (f.exists()) {
	            f.delete();
	        }
		}
		return AppUtil.returnObj(null);
	}

}
