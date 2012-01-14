/*---

    iGeo - http://igeo.jp

    Copyright (c) 2002-2012 Satoru Sugihara

    This file is part of iGeo.

    iGeo is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as
    published by the Free Software Foundation, version 3.

    iGeo is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with iGeo.  If not, see <http://www.gnu.org/licenses/>.

---*/

package igeo;

/**
   A subclass of IMap defined by two value to generate gradient map in u direction.
   
   @author Satoru Sugihara
   @version 0.7.0.0;
*/
public class IULinearMap extends IMap{
    public double uval1, uval2;
    public IULinearMap(double u1, double u2){ uval1 = u1; uval2 = u2; }
    public double get(double u, double v){ return (uval2-uval1)*u+uval1; }	
    public void flipU(){
	double tmp = uval1; uval1 = uval2; uval2 = tmp;
    }
}
