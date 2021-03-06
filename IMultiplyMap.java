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
   A subclass of IMap defined by multiplication of two maps.
   Output value is NOT crampped.
   
   @author Satoru Sugihara
*/
public class IMultiplyMap extends IMap{
    public IMap map1, map2;
    public IMultiplyMap(IMap m1,IMap m2){ map1=m1; map2=m2; }
    public double get(double u, double v){ return map1.get(u,v)*map2.get(u,v); }
    public void flipU(){ map1.flipU(); map2.flipU(); } //is it ok to modify the original?
    public void flipV(){ map1.flipV(); map2.flipV(); } //is it ok to modify the original?
}
