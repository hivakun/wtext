package com.github.hivakun.wtext.module.table;

/*
 * #%L
 * WText
 * %%
 * Copyright (C) 2016 Rivaldo Rodrigues
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.github.hivakun.wtext.arq.module.Text;
import com.github.hivakun.wtext.arq.module.DataContainer;
import com.github.hivakun.wtext.arq.parameter.TableCellParameter;
import com.github.hivakun.wtext.arq.parameter.TableParameter;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Represents a cell element at the document.
 *
 * @author hivakun
 * Created on 25/04/16
 */
public class Cell extends Text implements DataContainer {

    private Map<TableCellParameter, String> parameters = Maps.newHashMap();

    /**
     * Create a new cell element.
     *
     * @param element the string that represents the element
     */
    protected Cell(String element) {
        super(element);
    }

    /**
     * Create a new cell element with the desired column parameter.
     *
     * @param element   the string that represents the element
     * @param parameter the column parameter for the cell
     */
    protected Cell(String element, Map<TableCellParameter, String> parameters) {
        super(element);
        this.parameters = parameters;
    }

    /**
     * Get the column parameter for the cell.
     *
     * @return the column parameter for the cell
     */
    public Map<TableCellParameter, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<TableCellParameter, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Set the column parameter for the cell.
     *
     * @param parameter the column parameter for the cell
     */
    public void setParameter(TableCellParameter parameter, String value) {
        parameters.put(parameter, value);
    }

    public String getParameter(TableCellParameter parameter) {
        return parameters.get(parameter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Cell)) return false;

        Cell other = (Cell) o;

        return new EqualsBuilder()
                .append(element, other.element)
                .append(parameters, other.parameters)
                .isEquals();
    }
}
