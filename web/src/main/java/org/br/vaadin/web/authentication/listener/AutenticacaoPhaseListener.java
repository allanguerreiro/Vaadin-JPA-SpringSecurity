package org.br.vaadin.web.authentication.listener;

import javax.servlet.http.HttpSession;

/**
 * Created by allan on 28/07/16.
 */
//public class AutenticacaoPhaseListener implements PhaseListener {
//
//    public void afterPhase(PhaseEvent event) {
//        //não implementado
//    }
//
//    public void beforePhase(PhaseEvent event) {
//        FacesContext context = FacesContext.getCurrentInstance();
//        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
//        if (session != null) {
//            String mensagem = (String) session.getAttribute("msg");
//
//            if (mensagem != null) {
//                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, null));
//                session.setAttribute("msg", null);
//            }
//        }
//    }
//
//    public PhaseId getPhaseId() {
//        return PhaseId.RESTORE_VIEW;
//    }
//}
